package woo.app.suppliers;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Register supplier.
 */
public class DoRegisterSupplier extends Command<Storefront> {

  //FIXME add input fields // id nome e endereco

  public DoRegisterSupplier(Storefront receiver) {
    super(Label.REGISTER_SUPPLIER, receiver);
    //FIXME init input fields
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
  }

}
