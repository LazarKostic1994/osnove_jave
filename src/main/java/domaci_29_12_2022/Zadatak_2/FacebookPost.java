package domaci_29_12_2022.Zadatak_2;

public class FacebookPost {

    private String imeIPrezime;
    private String imePostProfila;
    private String text;
    private int likes;
    private int deljenje;

    public String getImeIPrezime(){
        return this.imeIPrezime;
    }
    public String getImePostProfila(){
        return this.imePostProfila;
    }
    public String getText(){
        return this.text;
    }
    public int getLikes(){
        return this.likes;
    }
    public int getDeljenje(){
        return this.deljenje;
    }
    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }
    public void setImePostProfila (String imePostProfila){
        this.imePostProfila = imePostProfila;
    }
    public void setText (String text){
        this.text = text;
    }
    public void like () {
    likes = likes + 1;
    }
    public void dislike () {
        if (likes < 0) {
            likes = 0;
        } else {
            likes = likes - 1;
        }
    }
    public int share (){
        deljenje = deljenje + 1;
        return deljenje;
    }
    public void print (){
        System.out.println(imeIPrezime + " >>> " + imePostProfila);
        System.out.println(text);
        System.out.println("Likes " + likes + " | " + "Shares " + deljenje);
    }
}
