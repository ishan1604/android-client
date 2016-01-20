package com.mifos.objects.survey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nasim Banu on 19,January,2016.
 */
public class Survey {
    private int id;
    private String key;
    private String name;
    private String description;
    private String countryCode;

    private List<QuestionDatas> questionDatas = new ArrayList<QuestionDatas>();




    public List<QuestionDatas> getQuestionDatas() {
        return questionDatas;
    }

    public void setQuestionDatas(List<QuestionDatas> questionDatas) {
        this.questionDatas = questionDatas;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}