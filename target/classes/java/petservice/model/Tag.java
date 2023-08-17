package petservice.model;

public class Tag {

    public Integer id;
    public String name;

    public Tag(String id, String name) {
        this.id = new Integer(id);
        this.name = name;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setId(String id){
        this.id = new Integer(id);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
