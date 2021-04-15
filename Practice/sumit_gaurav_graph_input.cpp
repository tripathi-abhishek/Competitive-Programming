 int n;cin>>n;
    for(int i=0;i<n;i++)
    {
        int x,y;cin>>x>>y;
        graph[x].push_back(y);
        graph[y].push_back(x);
    }