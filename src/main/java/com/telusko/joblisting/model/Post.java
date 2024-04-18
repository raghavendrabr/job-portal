package com.telusko.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection="JobPost")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String techs[];

    public Post() {
        System.out.println("constructor");
    }

    public String getProfile() {
        System.out.println("getProfile");
        return profile;
    }

    public void setProfile(String profile) {
        System.out.println("setProfile");
        this.profile = profile;
    }

    public String getDesc() {
        System.out.println("getDesc");
        return desc;
    }

    public void setDesc(String desc) {
        System.out.println("setDesc");
        this.desc = desc;
    }

    public int getExp() {
        System.out.println("getExp");
        return exp;
    }

    public void setExp(int exp) {
        System.out.println("SetExp");
        this.exp = exp;
    }

    public String[] getTechs() {
        System.out.println("getTech");
        return techs;
    }

    public void setTechs(String[] techs) {
        System.out.println("setTech");
        this.techs = techs;
    }

    @Override
    public String toString() {
        System.out.println("tostring");
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';

    }
}
