package com.deepti.JavaPrograms.Controller;

import com.deepti.JavaPrograms.Service.ProgramsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("/java")
@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/fibonnaci/{num}")
    public String getSomeOutput(@PathVariable("num") int number, @RequestParam (required =false) String oliver,
                                @RequestHeader(required = false) String good) {
        String text;
        text = ProgramsUtil.fibonnaci(number);
        logger.info("Completed fibonnaci series !");
        if(oliver!=null&&good!=null)
            return text.concat(" " + oliver + " " + good);
        else if(oliver==null&&good!=null)
            return text.concat( " "+ good);
        else if (oliver!=null&&good==null)
            return text.concat( " "+ oliver);
        else
            return text;
    }


    @GetMapping("/recursivefib/{num}")
    public List<Integer> getRecursiveResul(@PathVariable int num) {
        ArrayList<Integer> reslist=new ArrayList<>();

        try {

            if (num > 40) {
                logger.info("Number greater than 40 for recursive");
                throw new Exception();
            }

            if(num<0) {
                logger.info("Num less than 0 , so return empty list");
            }

            for(int i=1;i<=num;i++) {
                int res = ProgramsUtil.fibonnacirecursive(i);
                reslist.add(res);
            }
            logger.info("Returning recursive list of numbers");

        }catch (Exception e){
            e.printStackTrace();
            logger.info("Exception in recursive fibonacci :"+e.getMessage());

        }finally {
            return reslist;
        }



    }

    @GetMapping("/charcount/{line}")
    public String countCharsInLine(@PathVariable String line){
           return ProgramsUtil.countCharsInWord(line);

    }





}
