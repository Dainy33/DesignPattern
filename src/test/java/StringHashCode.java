import org.junit.Test;

import java.util.*;

public class StringHashCode {
    @Test
    public void StrHash(){
        String str1 = "aaa";
        String str2 = String.valueOf("aaa");
        String str3 = new String("aaa");
        String str4 = new String("aaa");
        String str5 = str4;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3==str4);
        System.out.println(str5==str4);


        String str6 = "aa";
        String str7 = "a";
        String str8 = "aa"+"a";
        String str9 = "aa"+str7;
        String str10 = new String("a");
        String str11 = "aa"+str10;
        System.out.println(str1==str8);
        System.out.println(str1==str9);
        System.out.println(str1==str11);


        Copy copy = new Copy();
        Class clazz1 = copy.getClass();
        Class clazz2 = Copy.class;
        System.out.println(clazz1==clazz2);

    }

    @Test
    public void subStr() {

        String str1 = "0123456789";
        String str2 = str1.substring(0,4);
        System.out.println(str2);
        String str3 = "1111000";
        System.out.println(str3);
        String str4 = str2 + "";
        System.out.println(str4);
        System.out.println(str2 == str3);
        System.out.println(str2 == str4);
        System.out.println(str3 == str4);

    }

    @Test
    public void stringgg(){
        /*        String str1=new String("1234");
        byte[] bytes=str1.getBytes();
        System.out.println(new String(bytes));
        System.out.println(String.valueOf(bytes));
        System.out.println(bytes.toString());

        Integer in =new Integer(5);

        System.out.println(String.valueOf(in));
        System.out.println(in.toString());

        String s1 = "1234";
        String s2 = "1234";
        String s3 = new String("1234");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);*/


        HashMap<String, Integer> map_Data = new HashMap();
        map_Data.put("A", 98);
        map_Data.put("B", 50);
        map_Data.put("C", 50);
        map_Data.put("D", 25);
        map_Data.put("E", 85);
        System.out.println(map_Data);

        List<Map.Entry<String, Integer>> list_Data = new ArrayList<Map.Entry<String, Integer>>(map_Data.entrySet());
        Collections.sort(list_Data, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //o1 to o2升序   o2 to o1降序
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(list_Data);
        System.out.println(list_Data.get(0).getKey());


        //去除空格和换行符
        String str = "{\"result\":\"success\",\"response\":\"200\",\"data\":{\"totalRows\":9,\"pagesize\":10,\"rows\":[{\"dbName\":\"ads_qbi_test\",\"departmentId\":\"45\",\"departmentName\":\"测试的部门\",\"projectName\":\"--\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"ads-qbi-test-54b5a762.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10400\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":1,\"tableGroupCount\":1,\"vip\":\"11.36.30.180\",\"port\":\"10400\",\"status\":\"OK\",\"createTime\":\"2018-08-0614:24:33\",\"createTimestamp\":1533536673000},{\"dbName\":\"ads_test\",\"departmentId\":\"6\",\"departmentName\":\"shuguang6\",\"projectName\":\"--\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"ads-test-960b9330.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10217\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":9,\"tableGroupCount\":3,\"vip\":\"11.36.30.180\",\"port\":\"10217\",\"status\":\"OK\",\"createTime\":\"2018-07-2414:48:43\",\"createTimestamp\":1532414923000},{\"dbName\":\"doc_test2\",\"departmentId\":\"166\",\"departmentName\":\"doc_test\",\"projectName\":\"--\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"doc-test2-1f2da923.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10106\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":58,\"tableGroupCount\":6,\"vip\":\"11.36.30.180\",\"port\":\"10106\",\"status\":\"OK\",\"createTime\":\"2018-06-1914:03:42\",\"createTimestamp\":1529388222000},{\"dbName\":\"drv_ads\",\"departmentId\":\"1053\",\"departmentName\":\"data_reliability_verify\",\"projectId\":\"722\",\"projectName\":\"data_reliability_verify\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"drv-ads-cecf7339.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10404\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":0,\"tableGroupCount\":0,\"vip\":\"11.36.30.180\",\"port\":\"10404\",\"status\":\"OK\",\"createTime\":\"2018-08-0813:03:01\",\"createTimestamp\":1533704581000},{\"dbName\":\"kkkkkk\",\"departmentId\":\"1037\",\"departmentName\":\"0JC-勿删-1\",\"projectName\":\"--\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"kkkkkk-b234fd01.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10397\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":17,\"tableGroupCount\":3,\"vip\":\"11.36.30.180\",\"port\":\"10397\",\"status\":\"OK\",\"createTime\":\"2018-08-0315:10:17\",\"createTimestamp\":1533280217000},{\"dbName\":\"test_ads_db005\",\"departmentId\":\"278\",\"departmentName\":\"dsec_test_sys_department\",\"projectId\":\"197\",\"projectName\":\"dsec_test_sys_project\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"test-ads-db005-966f56b0.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10179\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":0,\"tableGroupCount\":0,\"vip\":\"11.36.30.180\",\"port\":\"10179\",\"status\":\"OK\",\"createTime\":\"2018-07-0615:02:56\",\"createTimestamp\":1530860576000},{\"dbName\":\"vpc\",\"departmentId\":\"1037\",\"departmentName\":\"0JC-勿删-1\",\"projectId\":\"79\",\"projectName\":\"小卖部项目\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"vpc-54c4e237.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10388\",\"ecuType\":\"c1\",\"ecuCount\":2,\"tableCount\":4,\"tableGroupCount\":1,\"vip\":\"11.36.30.180\",\"port\":\"10388\",\"status\":\"OK\",\"createTime\":\"2018-07-3118:24:48\",\"createTimestamp\":1533032688000},{\"dbName\":\"vvpc\",\"departmentId\":\"135\",\"departmentName\":\"2勿删A_2\",\"projectName\":\"--\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"vvpc-de5b09f9.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10395\",\"ecuType\":\"s8\",\"ecuCount\":2,\"tableCount\":0,\"tableGroupCount\":0,\"vip\":\"11.36.30.180\",\"port\":\"10395\",\"status\":\"OK\",\"createTime\":\"2018-08-0314:50:36\",\"createTimestamp\":1533279036000},{\"dbName\":\"wwwww\",\"departmentId\":\"135\",\"departmentName\":\"2勿删A_2\",\"projectId\":\"673\",\"projectName\":\"A_temp\",\"regionId\":\"cn-qiandaohu-sg-d01\",\"connectInfo\":\"wwwww-946c7197.cn-qiandaohu-sg-amtest85001-a.env6.shuguang.com:10396\",\"ecuType\":\"s8\",\"ecuCount\":2,\"tableCount\":0,\"tableGroupCount\":0,\"vip\":\"11.36.30.180\",\"port\":\"10396\",\"status\":\"OK\",\"createTime\":\"2018-08-0314:53:26\",\"createTimestamp\":1533279206000}],\"pageNum\":1},\"errorMsg\":\"\",\"errorDetail\":\"\"}";
        String newstr = str.replaceAll("\\s*", "");
        System.out.print(newstr);



/*
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        System.out.println(map);
        map.put(1, 2);
        System.out.println(map);

        List<Integer> ll1=new ArrayList<>();
        List<Integer> ll2=new LinkedList<>();
        Collections.reverse(ll1);


        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);
        set.add(1);
        System.out.println(set);

        try {
            List<Date> list1 = new ArrayList<>();
            List<Date> list2 = new ArrayList<>();
            List<Date> list3 = new ArrayList<>();

            List<Date> list = new ArrayList<>();

            list1.add(new Date());
            Thread.sleep(2000);
            list1.add(new Date());
            Thread.sleep(5000);
            list2.add(new Date());
            Thread.sleep(4000);
            list3.add(new Date());
            Thread.sleep(2000);
            list2.add(new Date());
            Thread.sleep(2000);
            list2.add(new Date());
            Thread.sleep(6000);
            list3.add(new Date());
            Thread.sleep(3000);
            list1.add(new Date());
            Thread.sleep(8000);
            list3.add(new Date());

            list.addAll(list1);
            list.addAll(list2);
            list.addAll(list3);


            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println(list);

            //根据Date排序,重写Comparator
            Collections.sort(list, new Comparator<Date>() {
                @Override
                public int compare(Date o1, Date o2) {
                    return o1.compareTo(o2);
                }
            });

            System.out.println(list);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //thisTime<anotherTime ? -1 : (thisTime==anotherTime ? 0 : 1 取自Date Compareto
        //只用三元运算符比较>=<
        //a < b ? -1 : (a == b ? 0 : 1)
    }

}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-07 10:39
 **/
