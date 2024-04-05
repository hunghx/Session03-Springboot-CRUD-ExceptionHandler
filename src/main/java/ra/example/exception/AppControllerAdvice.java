package ra.example.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice // xu lis cac ngoai le ma controller nem ra
@Slf4j
public class AppControllerAdvice {
    @ExceptionHandler(NotFoundEntityException.class)
    public ModelAndView handleNotFound(NotFoundEntityException e){
        log.error("Entity not found ",e.getMessage());
        return new ModelAndView("not-found","err",e.getMessage());
    }
}
