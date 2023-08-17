package petservice.model;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    public Integer id;
    public Category category = new Category();
    public String name;
    public List<String> photoUrls;
    private List<Tag> tags = new ArrayList<Tag>();
    public String status;

    public Integer getId() {
        return id;
    }

    public void setId(String id){
        this.id = new Integer(id);
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

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setCategory(Category category){
        this.category = category;
    }

    public Category getCategory(){
        return this.category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(String id, String name) {
        tags.add(new Tag(id, name));
    }

    public List<String> getPhotoUrls(){
        return this.photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setPhotoUrls(String photoUrls){
        this.photoUrls = new ArrayList<String>();
        this.photoUrls.add(photoUrls);
    }
}
