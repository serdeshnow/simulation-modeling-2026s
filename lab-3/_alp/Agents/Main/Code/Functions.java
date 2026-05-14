SelectOutputOut selectOutput(double outCount)
{/*ALCODESTART::1776700880566*/
if (outCount <= 0.0) {
return Exit;}

double qSizeMin = min(qSize1, min(qSize2, min(qSize3, min(qSize4, min(qSize5, qSize6)))));
ArrayList<SelectOutputOut> bestList = new ArrayList<>();
if (qSizeMin == qSize1) bestList.add(Out1);
if (qSizeMin == qSize2) bestList.add(Out2);
if (qSizeMin == qSize3) bestList.add(Out3);
if (qSizeMin == qSize4) bestList.add(Out4);
if (qSizeMin == qSize5) bestList.add(Out5);
if (qSizeMin == qSize6) bestList.add(Out6);

int randomIndex = uniform_discr(0, bestList.size()-1);

return bestList.get(randomIndex);

/*ALCODEEND*/}

