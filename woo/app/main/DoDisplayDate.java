package woo.app.main;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show current date.
 */
public class DoDisplayDate extends Command<Storefront> {

  //FIXME add input fields

  public DoDisplayDate(Storefront receiver) {
    super(Label.SHOW_DATE, receiver);
    //FIXME init input fields
  }

  @Override
  public final void execute() throws DialogException {
    //FIXME implement command
  }
}
