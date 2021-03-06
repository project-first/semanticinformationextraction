package hibernate.entities;

// Generated Aug 13, 2012 4:14:16 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Url generated by hbm2java
 */
public class Url implements java.io.Serializable {

  private long id;
  private String protocol;
  private String host;
  private String path;
  private String versionInfo;
  private Set documentVersionsForOntologyUrlFk = new HashSet(0);
  private Set documentVersionsForDocumenturlFk = new HashSet(0);

  public Url() {
  }

  public Url(long id) {
    this.id = id;
  }

  public Url(long id, String protocol, String host, String path, String versionInfo,
             Set documentVersionsForOntologyUrlFk, Set documentVersionsForDocumenturlFk) {
    this.id = id;
    this.protocol = protocol;
    this.host = host;
    this.path = path;
    this.versionInfo = versionInfo;
    this.documentVersionsForOntologyUrlFk = documentVersionsForOntologyUrlFk;
    this.documentVersionsForDocumenturlFk = documentVersionsForDocumenturlFk;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProtocol() {
    return this.protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public String getHost() {
    return this.host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getVersionInfo() {
    return this.versionInfo;
  }

  public void setVersionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
  }

  public Set getDocumentVersionsForOntologyUrlFk() {
    return this.documentVersionsForOntologyUrlFk;
  }

  public void setDocumentVersionsForOntologyUrlFk(Set documentVersionsForOntologyUrlFk) {
    this.documentVersionsForOntologyUrlFk = documentVersionsForOntologyUrlFk;
  }

  public Set getDocumentVersionsForDocumenturlFk() {
    return this.documentVersionsForDocumenturlFk;
  }

  public void setDocumentVersionsForDocumenturlFk(Set documentVersionsForDocumenturlFk) {
    this.documentVersionsForDocumenturlFk = documentVersionsForDocumenturlFk;
  }

}
