/*
rule = Namedliteralarguments_v1
 */
package fix

object Namedliteralarguments_v1_Test {
  def complete(isSuccess: Boolean): Unit = ()
  def finish(isError: Boolean): Unit = ()
  complete(true)
  complete(isSuccess = true)
  complete(false)
  finish(true)
}
