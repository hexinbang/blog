package learn;

import com.blog.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hxb
 * @date 2019/1/12 14:40
 */
@Service
public class ServiceTest {
    @Autowired
    MailUtil mailUtil;
}
