package woo.app.transactions;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Pay transaction (sale).
 */
public class DoPay extends Command<Storefront> {

  //FIXME add input fields // id idV
  
  public DoPay(Storefront storefront) {
    super(Label.PAY, storefront);
    //FIXME init input fields
  }

  @Override
  public final void execute() throws DialogException {
    //FIXME implement command
  }

}
