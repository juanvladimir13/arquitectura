package com.uagrm.edu.capas;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public interface IPresentacion {

  public Map<String, String> getFormData();

  public void setFormData(Object[] data);

  public void clearFormData();

  public void setTable(Map<String, Object[]> data);

  public void setComboBox(List<String> data);

  public void create();

  public void save();

  public void delete();

  public void select();

  public void initListener();
}
