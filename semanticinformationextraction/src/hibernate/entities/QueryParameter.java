package hibernate.entities;

// Generated Aug 13, 2012 4:14:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * QueryParameter generated by hbm2java
 */
public class QueryParameter implements java.io.Serializable {

  private long id;
  private String querySite;
  private Date queryDate;
  private String querySentimentObject;
  private String queryString;
  private Set documentMetaDatas = new HashSet(0);

  public QueryParameter() {
  }

  public QueryParameter(long id) {
    this.id = id;
  }

  public QueryParameter(long id, String querySite, Date queryDate, String querySentimentObject,
                        String queryString, Set documentMetaDatas) {
    this.id = id;
    this.querySite = querySite;
    this.queryDate = queryDate;
    this.querySentimentObject = querySentimentObject;
    this.queryString = queryString;
    this.documentMetaDatas = documentMetaDatas;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuerySite() {
    return this.querySite;
  }

  public void setQuerySite(String querySite) {
    this.querySite = querySite;
  }

  public Date getQueryDate() {
    return this.queryDate;
  }

  public void setQueryDate(Date queryDate) {
    this.queryDate = queryDate;
  }

  public String getQuerySentimentObject() {
    return this.querySentimentObject;
  }

  public void setQuerySentimentObject(String querySentimentObject) {
    this.querySentimentObject = querySentimentObject;
  }

  public String getQueryString() {
    return this.queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public Set getDocumentMetaDatas() {
    return this.documentMetaDatas;
  }

  public void setDocumentMetaDatas(Set documentMetaDatas) {
    this.documentMetaDatas = documentMetaDatas;
  }

}
