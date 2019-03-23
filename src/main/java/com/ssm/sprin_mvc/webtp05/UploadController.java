package com.ssm.sprin_mvc.webtp05;


import com.ssm.sprin_mvc.javabea.UserInfo;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("f")
public class UploadController {

    public UploadController() {
        System.out.println("   UploadController() 文件上传~~~~~~~~~~~~~~~~~~~~~ ");
    }

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);//日志文件


    /**
     * CommonsMultipartResolver
     * @param ui
     * @param file
     * @return
     */
    @RequestMapping(value = "file")
    public String create(UserInfo ui, MultipartFile[] file, HttpServletRequest  request) {

        logger.info("  file up  one .............................. "+file.length);
        try {
            if (file != null && file.length > 0) {
                for (MultipartFile multipartFile : file) {
                    String  path=  request.getSession().getServletContext().getRealPath("/")+"file/"; //

                    logger.info("文件路径"+path);
                    FileUtils.writeByteArrayToFile(new File(path + multipartFile.getOriginalFilename()), multipartFile.getBytes());
                }
            }
        } catch (IOException e) {
            logger.error(e.toString());
        }
        return "index";


    }




}