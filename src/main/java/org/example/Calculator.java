package  org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
    protected  static final Logger logger = LogManager.getLogger();

    public Double division(Double dividend, Double divisor) {
        logger.info("Iniciando la división de {} entre {}", dividend, divisor);

        if (divisor == 0){
            logger.info("Estás tratando de dividir por cero.");
            return null;
        }

        var result = dividend / divisor;

        logger.info("{} divido entre {} es igual a {}", dividend, divisor, result);

        return result;
    }
}