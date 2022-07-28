package woo.app.main;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show global balance.
 */
public class DoShowGlobalBalance extends Command<Storefront> {

  //FIXME add input fields

  public DoShowGlobalBalance(Storefront receiver) {
    super(Label.SHOW_BALANCE, receiver);
    //FIXME init input fields
  }

  @Override
  public final void execute() {
    //FIXME implement command
  }
}
