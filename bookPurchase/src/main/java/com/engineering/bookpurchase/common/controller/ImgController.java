package com.engineering.bookpurchase.common.controller;

import com.engineering.bookpurchase.common.pojo.BookUpload;
import com.engineering.bookpurchase.common.service.UploapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImgController {

    @Autowired
    private UploapService uploapService;

    // 项目根路径下的目录  -- SpringBoot static 目录相当于是根路径下（SpringBoot 默认）
    public final static String IMG_PATH_PREFIX = "static/upload/imgs";
    public final static String IMG_PATH = "upload/imgs/";

    public static File getImgDirFile() {
        // 构建上传文件的存放 "文件夹" 路径
        String fileDirPath = new String("src/main/resources/" + IMG_PATH_PREFIX);
        System.out.println("寻找的文件夹路劲："+fileDirPath);
        File fileDir = new File(fileDirPath);
        if (!fileDir.exists()) {
            // 递归生成文件夹
            fileDir.mkdirs();
        }
        return fileDir;
    }

    @RequestMapping("/upload/headImg")
    @ResponseBody
    public Map<String, Object> headImg(@RequestParam(value="file",required=false) MultipartFile file){
        String prefix="";
        String dateStr="";
        Integer bookUploadId=0;
        //获取当前时间
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createData = formatter2.format(new Date());
        try {
            if(file!=null){
                //获取文件名和后缀名
                String originalFilename = file.getOriginalFilename();
                // 存放上传图片的文件夹
                File fileDir = ImgController.getImgDirFile();
                // 输出文件夹绝对路径  -- 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
                String filePath=fileDir.getAbsolutePath();
                System.out.println(filePath);
                //时间戳
                dateStr=formatter.format(new Date());
                //获取图片的后缀
                prefix=originalFilename.substring(originalFilename.lastIndexOf(".")+1);
                System.out.println("prefix:"+prefix);
                //图片重命名
                String renameFilename=dateStr+ "." + prefix;
                String relativePath=IMG_PATH+renameFilename;
                System.out.println("renameFilename:"+renameFilename);
                //把文件路径含有\\改成/
                //filepath = filepath.replace("\\", "/");
                File files=new File(filePath,renameFilename);
                if(!files.getParentFile().exists()){
                    files.getParentFile().mkdirs();
                }
                file.transferTo(files);
                System.out.println("上传成功");

                //把数据写入数据库
                BookUpload bookUpload = new BookUpload();
                bookUpload.setOriginalFilename(originalFilename);
                //bookUpload.setOriginalName();
                bookUpload.setPrefix(prefix);
                bookUpload.setRenameFilename(renameFilename);
                bookUpload.setRenameName(dateStr);
                bookUpload.setFilePath(filePath);
                bookUpload.setCreateData(createData);
                bookUpload.setRelativePath(relativePath);
                uploapService.insert(bookUpload);
                bookUploadId = bookUpload.getId();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","上传成功");
        map.put("bookUploadId",bookUploadId);
        return map;
    }


}