package com.uagrm.edu.capas;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Juan Vladimir
 * @see <a href="https://github.com/juanvladimir13">github</a>
 */
public interface IDato {

  public void setData(Map<String, String> data);

  public Object[] save();

  public boolean delete();

  public Map<String, Object[]> list();

  public List<String> rowsToString();
}
