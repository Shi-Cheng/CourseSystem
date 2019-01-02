import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public List listCourseTest;

    public ListTest() {
        this.listCourseTest = new ArrayList();
    }

    public void listAdd(){
        Course course = new Course("1","语文");
        listCourseTest.add(course);
        Course c1 = (Course)listCourseTest.get(0);
        System.out.println("添加成功了，id："+c1.id + " name "+c1.name);

        //报错，出现坐标越界异常
        Course course1 = new Course("2","数学");
        listCourseTest.add(0,course1);
        Course c2 = (Course) listCourseTest.get(0);
        System.out.println("添加成功了,id"+c2.id + "  name "+c2.name);

        Course[] course2 = {new Course("3","离散"),new Course("4","现代")};
        listCourseTest.addAll(Arrays.asList(course2));
        Course c3 = (Course)listCourseTest.get(2);
        Course c4 = (Course)listCourseTest.get(3);
        System.out.println("添加成功了 "+c3.id +":"+ c3.name + " ; "+c4.id + " : "+c4.name);

        Course[] course3  = {new Course("6","毛概"),new Course("7","思修"),new Course("8","美术")};
        listCourseTest.addAll(2,Arrays.asList(course3));

        Course c5 = (Course)listCourseTest.get(3);
        Course c6 = (Course)listCourseTest.get(4);
        System.out.println("插入的元素"+c5.id +" : "+ c5.name + " : "+ c6.id +" : "+c6.name);

    }

    public void getList(){
        int count = listCourseTest.size();
        System.out.println("输出课程信息");
        for(int i = 0;i < count; i++){
            Course c1 = (Course)listCourseTest.get(i);
            System.out.println(c1.id +" : "+ c1.name);
        }
    }

    public void testForEach() {
        System.out.println("这是ForEach方法");
        for(Object ob:listCourseTest){
            Course cr = (Course)ob;
            System.out.println(cr.id + " : "+cr.name);
        }
    }

    public void testIterator() {
        Iterator it = listCourseTest.iterator();
        System.out.println("这是testIterator 方法");
        while (it.hasNext()){
            Course course = (Course)it.next();
            System.out.println(course.id + " : " + course.name);
        }
        
    }

    public static void main(String[] args){
        ListTest listTest = new ListTest();
        listTest.listAdd();
        listTest.getList();
        listTest.testIterator();
        listTest.testForEach();
    }


}
