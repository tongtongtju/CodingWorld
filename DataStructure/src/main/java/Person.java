/**
 * @author 吃西瓜的通酱
 * @createTime 2022-04-04 10:09
 */
public class Person {
    private String name;
    private  Integer age;
    private Boolean gender; //true 男；false：女
    public void eat(){
        System.out.println(name + "吃东西");
    }
    public void walk(String friend_name,Integer friend_age){
        System.out.println(name + "和"+friend_age+"岁朋友"+friend_name+"走路");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
