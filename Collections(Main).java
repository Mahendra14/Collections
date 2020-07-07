package Jaskaran.Collections;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        MyList<Integer> m= new MyList<Integer>();
        for(int i = 0;i<15;i++)
        {
            m.add(i);
        }
        m.remove(3);
        m.remove(3);
        LOGGER.info("Size of List :"+ml.size()+"");
        LOGGER.info("Print List\n");
        LOGGER.info(" List : \n");
        m.display();
    }
}
