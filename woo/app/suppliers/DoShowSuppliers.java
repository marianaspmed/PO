package woo.app.suppliers;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show all suppliers.
 */
public class DoShowSuppliers extends Command<Storefront> {

  //FIXME add input fields // no input

  public DoShowSuppliers(Storefront receiver) {
    super(Label.SHOW_ALL_SUPPLIERS, receiver);
    //FIXME init input fields
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
  }
}
