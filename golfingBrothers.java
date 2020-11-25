public class golfingBrothers {
  public static double average(ArrayList<Integer> golfList) {
    double avg = 0.0;
    double sum = 0.0;
    int length = golfList.size();
    for (int i = 0; i < length; i++) {
      sum += golfList.get(i);
    }
    if (length == 1) {
      return 0.0;
    }
    return sum / (golfList.size());
  }

  public static String golfingBrothers(ArrayList<Integer> adamList, ArrayList<Integer> bobList, ArrayList<Integer> craigList) {
    double avgA = average(adamList);
    double avgB = average(bobList);
    double avgC = average(craigList);
    if (avgA < avgB && avgA != 0) {
      if (avgA < avgC) {
        return "adam";
      }
    } else if (avgB < avgA && avgB != 0) {
      if (avgB < avgC) {
        return "bob";
      }
    } else if (avgC < avgA && avgA != 0) {
      if (avgC < avgB) {
        return "craig";
      }
    }
  }
}
