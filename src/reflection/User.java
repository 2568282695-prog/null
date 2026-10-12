package reflection;
@User_db("tb_user")
public class User {
    @Name("name_id")
    private String name;
    private int id;
    private int len;

    public User(String name, int id, int len) {
        this.name = name;
        this.id = id;
        this.len = len;
    }

    public int getId() {
        return id;
    }

    public int getLen() {
        return len;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", len=" + len +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getName() {
        return name;
    }
}
