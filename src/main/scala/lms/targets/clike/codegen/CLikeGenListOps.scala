package scala.lms
package targets.clike.codegen

import internal.GenericNestedCodegen
import ops.{BaseGenListOps, ListOpsExp}

import java.io.PrintWriter

trait CLikeGenListOps extends BaseGenListOps with CLikeGenBase {
  val IR: ListOpsExp
  import IR._

/*
  override def emitNode(sym: Sym[Any], rhs: Def[Any]) = {
      rhs match {
        case _ => super.emitNode(sym, rhs)
      }
    }
*/    
}

trait CudaGenListOps extends CudaGenEffect with CLikeGenListOps
trait OpenCLGenListOps extends OpenCLGenEffect with CLikeGenListOps
trait CGenListOps extends CGenEffect with CLikeGenListOps

