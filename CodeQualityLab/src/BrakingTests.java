import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrakingTests {
	
	@Test
	void Test20KpmInDryWeatherWithDriver() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY, BrakingConditions.BRAKES_COLD);

			assertEquals(2, calc.getBrakingDistanceFor(20));
		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test40KpmDryWeatherWithDriver() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY, BrakingConditions.BRAKES_COLD);

			assertEquals(8, calc.getBrakingDistanceFor(40));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test60KpmDryWeatherWithDriver() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY, BrakingConditions.BRAKES_COLD);

			assertEquals(16, calc.getBrakingDistanceFor(60));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test80KpmDryWeatherWithDriver() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY, BrakingConditions.BRAKES_COLD);

			assertEquals(31, calc.getBrakingDistanceFor(80));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test100KpmDryWeatherWithDriver() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY, BrakingConditions.BRAKES_COLD);

			assertEquals(46, calc.getBrakingDistanceFor(100));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}
	
	@Test
	void Test20KpmInDryWeatherWithDriverAndPassenger() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER, BrakingConditions.BRAKES_COLD);

			assertEquals(2, calc.getBrakingDistanceFor(20));
		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test40KpmDryWeatherWithDriverAndPassenger() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER, BrakingConditions.BRAKES_COLD);

			assertEquals(9, calc.getBrakingDistanceFor(40));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test60KpmDryWeatherWithDriverAndPassenger() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER, BrakingConditions.BRAKES_COLD);

			assertEquals(18, calc.getBrakingDistanceFor(60));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test80KpmDryWeatherWithDriverAndPassenger() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER, BrakingConditions.BRAKES_COLD);

			assertEquals(34, calc.getBrakingDistanceFor(80));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test100KpmDryWeatherWithDriverAndPassenger() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER, BrakingConditions.BRAKES_COLD);

			assertEquals(51, calc.getBrakingDistanceFor(100));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}
	
	@Test
	void Test20KpmInDryWeatherWithFullCar() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL, BrakingConditions.BRAKES_COLD);

			assertEquals(3, calc.getBrakingDistanceFor(20));
		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test40KpmDryWeatherWithFullCar() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL, BrakingConditions.BRAKES_COLD);

			assertEquals(11, calc.getBrakingDistanceFor(40));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test60KpmDryWeatherWithFullCar() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL, BrakingConditions.BRAKES_COLD);

			assertEquals(21, calc.getBrakingDistanceFor(60));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test80KpmDryWeatherWithFullCar() {

		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL, BrakingConditions.BRAKES_COLD);

			assertEquals(41, calc.getBrakingDistanceFor(80));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}

	@Test
	void Test100KpmDryWeatherWithFullCar() {
		try {
			BrakingDistanceEstimator calc = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL, BrakingConditions.BRAKES_COLD);

			assertEquals(61, calc.getBrakingDistanceFor(100));

		} catch (InvalidBrakingConditionsException execption) {
			fail("execption");
		}
	}
}
