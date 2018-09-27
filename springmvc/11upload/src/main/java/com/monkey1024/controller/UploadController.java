package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;

/**
 * 文件上传
 */
@Controller
public class UploadController {

    @RequestMapping("/upload1.do")
    public ModelAndView upload1(MultipartFile photo, HttpSession session) throws Exception {

        ModelAndView mv = new ModelAndView();

        if (!photo.isEmpty()) {
            //获取服务器上传的文件路径
            String path = session.getServletContext().getRealPath("/upload");
            //获取文件名称
            String filename = photo.getOriginalFilename();
            //限制文件上传的类型
            if ("image/png".equals(photo.getContentType())) {
                File file = new File(path, filename);
                //完成文件上传
                photo.transferTo(file);
                mv.addObject("filename",filename);
            }else {
                mv.addObject("msg","请选择png格式的文件上传");
                mv.setViewName("/upload_fail");

                return mv;
            }

        }



        mv.setViewName("/upload_success");
        return mv;
    }
}