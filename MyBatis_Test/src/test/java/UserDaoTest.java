import cn.MybatisUntils;
import cn.User;
import cn.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //第一步，获取SqlSession对象
        SqlSession sqlSession = MybatisUntils.getSqlSession();
        // 执行sql
        //方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
}
