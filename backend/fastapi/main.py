from fastapi import FastAPI, HTTPException

app = FastAPI()

@app.get('/health')
async def health_check():
    return {'status': 'healthy'}

@app.post('/reconcile')
async def reconcile(data: dict):
    # Placeholder for reconciliation logic
    try:
        # Call Go microservice
        return {'result': 'success'}
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))