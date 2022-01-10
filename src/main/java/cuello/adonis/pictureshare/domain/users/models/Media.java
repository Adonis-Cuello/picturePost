package cuello.adonis.pictureshare.domain.users.models;

import javax.persistence.*;

@Entity
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imageUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POST_ID", referencedColumnName = "ID")
    private Post post;

    public Media() {
    }

    public Media(String imageUrl, Post post) {
        this.imageUrl = imageUrl;
        this.post = post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", post=" + post +
                '}';
    }
}
