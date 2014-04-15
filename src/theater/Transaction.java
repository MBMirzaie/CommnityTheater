/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * 
 * Class for AccountTransaction
 * 1.  Payee					object of Theater or Person class
 * 2.  Payer					object of Theater or Person class
 * 3.  Amount					double
 * 4.  Reason					String "ticket sale", "weekly pay", etc.
 * 
 */
public class Transaction 
{
    public Transaction(Account payee, Account payer, double amt, String reason)
    {
        payee.recieveDeposit(amt, reason);
        payer.givePayment(amt, reason);
    }
}
