package com.yash.siddiqui;

import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ClearCacheMemory {
  public static void main(String[] args) {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    try {
      FileReader reader = new FileReader("C:\\Users\\siddiqui.mahboob\\eclipse-workspace\\CleanUpProject\\Data\\script.js");
      engine.eval(reader);
      reader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

