package com.Faris.Controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping(value = "/download")
public class DownloadController {
    @RequestMapping(value = "/downloadController")
    public void downloadController(String filename, HttpServletResponse response, HttpSession session) throws IOException {
//        设置响应头，以附件形式下载
        response.setHeader("content-disposition","attachment;filename="+filename);
        String realPath=session.getServletContext().getRealPath("/uploads");
        String path=realPath+"\\"+filename;
//        以流的形式对外输出服务器的指定文件
        IOUtils.copy(new FileInputStream(path),response.getOutputStream()); //应导入org.apache.commons.io包下的


    }
    @RequestMapping(value = "/cdownloadController")
    public void cdownloadController(String filename, HttpServletResponse response, HttpSession session) throws IOException {
//        设置响应头，以附件形式下载
        response.setHeader("content-disposition","attachment;filename="+filename);
        String realPath=session.getServletContext().getRealPath("/C_uploads");
        String path=realPath+"\\"+filename;
//        以流的形式对外输出服务器的指定文件
        IOUtils.copy(new FileInputStream(path),response.getOutputStream()); //应导入org.apache.commons.io包下的


    }
    @RequestMapping(value = "/edownloadController")
    public void edownloadController(String filename, HttpServletResponse response, HttpSession session) throws IOException {
//        设置响应头，以附件形式下载
        response.setHeader("content-disposition","attachment;filename="+filename);
        String realPath=session.getServletContext().getRealPath("/E_uploads");
        String path=realPath+"\\"+filename;
//        以流的形式对外输出服务器的指定文件
        IOUtils.copy(new FileInputStream(path),response.getOutputStream()); //应导入org.apache.commons.io包下的


    }
}
