package com.bendas.winterandsummer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

  private static Solution solution = new Solution();

  @Test
  public void shouldSolution() {
    int[] days = new int[] {1, 2, 3, 4};
    int result = solution.solution(days);
    assertThat(result, is(1));
  }
  @Test
  public void shouldSolution1() {
    int[] days = new int[] {5, -2, 3, 8, 6};
    int result = solution.solution(days);
    assertThat(result, is(3));
  }
  @Test
  public void shouldSolution2() {
    int[] days = new int[] {-5, -5, -5, -42, 6, 12};
    int result = solution.solution(days);
    assertThat(result, is(4));
  }
  @Test
  public void shouldSolution3() {
    int[] days = new int[] {7, -10, -5, 15, 6, 12, 15, 14, 9, 16, 20, 16};
    int result = solution.solution(days);
    assertThat(result, is(9));
  }
  @Test
  public void shouldSolution4() {
    int[] days = new int[] {3, 4, 5, 8, 8, 6, 10, 2, 5, 11, 20, 11, 32};
    int result = solution.solution(days);
    assertThat(result, is(9));
  }
  @Test
  public void shouldSolution5() {
    int[] days = new int[] {3, 4, 5, 8, 8, 6, 10, 2};
    int result = solution.solution(days);
    assertThat(result, is(8));
  }

}
