package slm.tutorium.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public LocalTime getTime() {
        return LocalTime.now();
    }

    public String getDate(String format) {

        LocalDate localDate = LocalDate.now();

        if(format != null){
            // es wurde ein Format übergeben
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
            return dtf.format(localDate);
        } else {
            // es wurde kein Format übergeben
            return localDate.toString();
        }
    }

}
