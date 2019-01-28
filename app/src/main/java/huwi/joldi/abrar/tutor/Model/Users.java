package huwi.joldi.abrar.tutor.Model;


public class Users {

    String phone;
    String name;
    String pro_pic;
    String uid;
    String mail;
    String institute;
    String tid;


    public Users() {
    }


    public Users(String phone, String name, String pro_pic, String uid, String mail, String institute, String tid) {
        this.phone = phone;
        this.name = name;
        this.pro_pic = pro_pic;
        this.uid = uid;
        this.mail = mail;
        this.institute = institute;
        this.tid = tid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPro_pic() {
        return pro_pic;
    }

    public void setPro_pic(String pro_pic) {
        this.pro_pic = pro_pic;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
