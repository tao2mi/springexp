import com.ybq.service.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    static Logger logger = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        logger.debug("begin");
        String[] s = {};
        String[] s1 = new String[1];
        String[] s2 = new String[] {};



       /* ClassPathXmlApplicationContext ctxParent = new ClassPathXmlApplicationContext("classpath:application-context-parent.xml");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"classpath:application-context.xml"}, false, ctxParent);
        ctx.refresh();*/
       /* Action2 action2 = ctx.getBean(Action2.class);
        System.out.println(action2.saySome("yyy"));
        Action action = ctx.getBean(Action.class);
        System.out.println(action.saySome("yyy"));*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"classpath:application-context.xml"});
        Action action = ctx.getBean(Action.class);
        System.out.println(action.saySome("yyy"));
        System.out.println(action.myName);
        System.out.println(action.beanFactory);
        logger.debug("end");
        System.out.println(ctx);
        ctx.close();
    }
}
