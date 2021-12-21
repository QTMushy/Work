while(!feof(inPtr))
    {
        fprintf(outPtr,"%d ",temp);
		insert(&rootPtr,temp);
        fscanf(inPtr,"%d",&temp);
    }
	fprintf(outPtr,"\n");