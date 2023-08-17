package petservice.model;

public class Category {

    public Integer id;
    public String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = new Integer(id);
    }


}
