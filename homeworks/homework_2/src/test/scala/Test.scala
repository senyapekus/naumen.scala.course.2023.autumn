import utest._
import Exercises._

object Test extends TestSuite {

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(5, 10) == 30)
            assert(Exercises.sumOfDivBy3Or5(3, 6) == 14)
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(30) == Seq(2, 3, 5))
            assert(Exercises.primeFactor(1) == Seq.empty)
        }

        'test_sumScalars - {
            val a = Exercises.Vector2D(1, 0)
            val b = Exercises.Vector2D(0, 1)
            val c = Exercises.Vector2D(1, 2)
            val d = Exercises.Vector2D(2, 1)
            val e = Exercises.Vector2D(10, 10)
            val f = Exercises.Vector2D(100, 100)

            assert(Exercises.sumScalars(a, b, c, d) == 4)
            assert(Exercises.sumScalars(f, e, a, b) == 2000)
        }

        'test_sumCosines - {
            val a = Exercises.Vector2D(1, 0)
            val b = Exercises.Vector2D(0, 1)
            val e = Exercises.Vector2D(1, 0)
            val f = Exercises.Vector2D(0, 1)

            assert(Exercises.sumCosines(e, f, a, b) == 1)
        }

        'test_sortByHeavyweight - {
            assert(sortByHeavyweight(Map.empty) == Seq.empty)
            assert(sortByHeavyweight(Map("1" -> (1, 1))) == Seq("1"))
            assert(sortByHeavyweight(Map("Ti" -> (2, 1), "Z" -> (1, 4))) == Seq("Z", "Ti"))
        }
    }
}
