package exo34;

import java.util.List;

public class SimplePrinter implements PrinterScan, PrinterCopy, PrinterFaxList, PrinterPrint {

  @Override
  public void print() {};

  @Override
  public void scan() {}

  @Override
  public void copy() {}

  @Override
  public void fax(List<Document> l) {}
}
