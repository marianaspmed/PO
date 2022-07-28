package woo.app.clients;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.DialogException;
import woo.Storefront;

/**
 * Show all clients.
 */
public class DoShowAllClients extends Command<Storefront> {

  //FIXME add input fields // no input

  public DoShowAllClients(Storefront storefront) {
    super(Label.SHOW_ALL_CLIENTS, storefront);
                //FIXME init input fields
  }

  @Override
  public void execute() throws DialogException {
    //FIXME implement command
  }
}
