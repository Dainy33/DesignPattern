import com.dainy33.Factory.FactoryMethod.entity.ArticleInfo;
import org.junit.Test;

public class Copy {

    //值类型引用类型=
    @Test
    public void intCopy() {
        int a = 5;
        int c = a;
        c = 1;
        System.out.println(a);
        System.out.println(c);
    }

    @Test
    public void StringCopy() {
        String  a= "aaa";
        String c = a;
        System.out.println(c.hashCode());
        c = "bbb";
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println("bbb".hashCode());
    }

    @Test
    public void ArrayCopy(){
        int []a = new int[3];
        for(int i =0;i<3;i++){
            a[i]=1;
        }
        int []b = a;
        for(int i =0;i<3;i++){
            b[i]=2;
        }

        for(int i =0;i<3;i++){
            System.out.println(a[i]);
        }

        System.out.println("--------------------------------");

        for(int i =0;i<3;i++){
            System.out.println(b[i]);
        }

    }

    @Test
    public void ObjectCopy(){
        ArticleInfo articleInfo1 = new ArticleInfo();
        articleInfo1.setAuthor("1");
        articleInfo1.setTitle("1");

        ArticleInfo articleInfo2 = articleInfo1;

        articleInfo2.setTitle("2");
        articleInfo2.setAuthor("2");

        System.out.println(articleInfo1.getAuthor());
        System.out.println(articleInfo1.getTitle());
    }

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 15:36
 **/
