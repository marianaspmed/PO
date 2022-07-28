package woo.app.clients;

import pt.tecnico.po.ui.Command;                                                                                                              import pt.tecnico.po.ui.DialogException;                                                                                                      import pt.tecnico.po.ui.Input;                                                                                                                import woo.Storefront;                                                                                                                        //FIXME import other classes

/**
 * Show client.
 */
public class DoShowClient extends Command<Storefront> {

  //FIXME add input fields // id

  public DoShowClient(Storefront storefront) {
    super(Label.SHOW_CLIENT, storefront);
    //FIXME init input fields
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
  }

}
