object Ext {
  implicit class ListHasAsScala[A](l: java.util.List[A]) {
    def asScala: Unit = ()
  }
  def asScalaDirect[A](l: java.util.List[A]): Unit = ()
}

object Test {
  import Ext.*

  def test(x: RawList_1): Unit = x.asScala

  def testDirect(x: RawList_1): Unit = Ext.asScalaDirect(x)
}
